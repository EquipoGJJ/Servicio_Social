import tkinter as tk
from tkinter import ttk
from tkinter import messagebox
import matplotlib.pyplot as plt
from matplotlib.backends.backend_tkagg import FigureCanvasTkAgg

class CuestionarioApp(tk.Tk):
    def __init__(self):
        super().__init__()
        self.title("Cuestionario")
        self.geometry("800x800")
        
        self.nombre_usuario = tk.StringVar()
        self.grupo_seleccionado = tk.StringVar()
        self.respuestas = {}
        
        self.frame_cuestionario = ttk.Frame(self)
        self.frame_cuestionario.pack(padx=20, pady=20, fill="both", expand=True)
        
        self.crear_interfaz()
    
    def crear_interfaz(self):
        # Sección de información del usuario
        frame_usuario = ttk.Frame(self.frame_cuestionario)
        frame_usuario.pack(pady=(0, 20), fill="both", expand=True)
        
        ttk.Label(frame_usuario, text="Nombre:").grid(row=0, column=0, padx=5, pady=5, sticky="w")
        ttk.Entry(frame_usuario, textvariable=self.nombre_usuario, width=40).grid(row=0, column=1, padx=5, pady=5)
        
        ttk.Label(frame_usuario, text="Grupo:").grid(row=1, column=0, padx=5, pady=5, sticky="w")
        ttk.Combobox(frame_usuario, textvariable=self.grupo_seleccionado, values=["Grupo 1", "Grupo 2"]).grid(row=1, column=1, padx=5, pady=5)
        
        # Sección de preguntas
        frame_preguntas = ttk.Frame(self.frame_cuestionario)
        frame_preguntas.pack(pady=(0, 20), fill="both", expand=True)
        
        ttk.Label(frame_preguntas, text="Por favor, responde las siguientes preguntas:").pack()
        
        # Etiqueta de advertencia sobre opciones de respuesta
        ttk.Label(frame_preguntas, text="(+): Más frecuentemente\n(-): De vez en cuando", font=("Helvetica", 10, "italic"), foreground="gray").pack(pady=(10, 0))
        
        self.respuestas_preguntas = {}
        preguntas = [
            "Tengo fama de decir lo que pienso claramente y sin rodeos.",
            "Estoy seguro(a) de lo que es bueno y lo que es malo, lo que esta bien y lo que está mal",
            "Muchas veces actuó sin mirar las consecuencias",
            "Normalmente trato de resolver los problemas metódicamente y paso a paso.",
            "Creo que los formulismos acortan y limitan la actuación libre de las personas.",
            "Me interesa saber cuáles son los sistemas de valores de los demás u con qué criterios actúan.",
            "Pienso que el actuar intuitivamente puede ser siempre tan válido como actuar reflexivamente.",
            "Creo que lo más importante es que las cosas funcionen.",
            "Procuro estar al tanto de lo que ocurre aqui y ahora.",
            "Disfruto cuando tengo tiempo para preparar mi trabajo y realizarlo a conciencia.",
            "Estoy a gusto siguiendo un orden, en las comidas, en el estudio , haciendo ejercicio regularmente.",
            "Cuando esucho una nueva idea, enseguida comienzo a pensar cómo ponerla en práctica.",
            "Prefiero las ideas originales y novedosas aunque no sean prácticas.",
            "Admito y me ajusto a las normas sólo si me sirven para lograr mis objetivos.",
            "Normalmente encajo bien con personas reflexivas, y me cuesta sintonizar con personas demasiadas espontáneas, imprevisibles.",
            "Escucho  con más frecuencia de lo que hablo.",
            "Prefiero las cosas estructuradas a las desordenadas.",
            "Cuando poseo cualquier información, trato de interpretarla bien antes de manifestar alguna conclusión",
            "Antes de hacer algo estudio con cuidado sus ventajas e inconvenientes"  
            # Añade más preguntas aquí según necesites
        ]
        for i, pregunta in enumerate(preguntas):
            ttk.Label(frame_preguntas, text=pregunta).pack(anchor="w", padx=5, pady=2)
            respuesta_frame = ttk.Frame(frame_preguntas)
            respuesta_frame.pack(anchor="w", padx=5, pady=2)
            respuesta = tk.StringVar()
            ttk.Radiobutton(respuesta_frame, text='+', variable=respuesta, value='+').pack(side="left", padx=5, pady=2)
            ttk.Radiobutton(respuesta_frame, text='-', variable=respuesta, value='-').pack(side="left", padx=5, pady=2)
            self.respuestas_preguntas[pregunta] = respuesta
        
        # Botón para enviar el cuestionario
        ttk.Button(self.frame_cuestionario, text="Guardar Cuestionario", command=self.guardar_cuestionario).pack(pady=(0, 20))
    
    def guardar_cuestionario(self):
        if self.validar_campos():
            if self.validar_respuestas():
                self.guardar_respuestas()
                self.mostrar_resultados()
            else:
                messagebox.showwarning("Advertencia", "Por favor, responde todas las preguntas antes de guardar el cuestionario.")
        else:
            messagebox.showwarning("Advertencia", "Por favor, completa todos los campos antes de guardar el cuestionario.")
    
    def validar_campos(self):
        nombre = self.nombre_usuario.get()
        grupo = self.grupo_seleccionado.get()
        return nombre != "" and grupo != ""
    
    def validar_respuestas(self):
        for respuesta in self.respuestas_preguntas.values():
            if respuesta.get() not in ["+", "-"]:
                return False
        return True
    
    def guardar_respuestas(self):
        grupo_actual = self.grupo_seleccionado.get()
        self.respuestas[grupo_actual] = {pregunta: respuesta.get() for pregunta, respuesta in self.respuestas_preguntas.items()}
    
    def mostrar_resultados(self):
        nombre_usuario = self.nombre_usuario.get()
        
        # Crear una nueva ventana para mostrar los gráficos
        ventana_graficos = tk.Toplevel(self)
        ventana_graficos.title("Resultados del cuestionario")
        
        # Graficar resultados por grupo
        for grupo, respuestas_grupo in self.respuestas.items():
            fig, ax = plt.subplots(figsize=(8, 6))
            ax.set_title(f'Resultados para {nombre_usuario} - {grupo}')
            ax.bar(respuestas_grupo.keys(), [list(respuestas_grupo.values()).count('+'), list(respuestas_grupo.values()).count('-')], color=['green', 'red'])
            ax.set_ylabel('Número de respuestas')
            ax.set_xlabel('Preguntas')
            canvas = FigureCanvasTkAgg(fig, master=ventana_graficos)
            canvas.draw()
            canvas.get_tk_widget().pack(side=tk.TOP, fill=tk.BOTH, expand=1)
        
        # Graficar resultados en general
        respuestas_generales = {}
        for grupo, respuestas_grupo in self.respuestas.items():
            for pregunta, respuesta in respuestas_grupo.items():
                if pregunta not in respuestas_generales:
                    respuestas_generales[pregunta] = {'+': 0, '-': 0}
                respuestas_generales[pregunta][respuesta] += 1
        
        fig, ax = plt.subplots(figsize=(8, 6))
        ax.set_title(f'Resultados generales para {nombre_usuario}')
        for pregunta, valores in respuestas_generales.items():
            ax.bar(pregunta, valores['+'], color='green', label='+')
            ax.bar(pregunta, valores['-'], color='red', bottom=valores['+'], label='-')
        ax.set_ylabel('Número de respuestas')
        ax.set_xlabel('Preguntas')
        ax.legend()
        ax.tick_params(axis='x', rotation=90)
        canvas = FigureCanvasTkAgg(fig, master=ventana_graficos)
        canvas.draw()
        canvas.get_tk_widget().pack(side=tk.TOP, fill=tk.BOTH, expand=1)

# Ejecutar la aplicación
app = CuestionarioApp()
app.mainloop()
