import React, { useState } from 'react';
import { TextField, Button, FormControl, InputLabel, Select, MenuItem, Grid, Typography, FormControlLabel, RadioGroup, Radio } from '@mui/material';

function Cuestionario() {
  const [nombre, setNombre] = useState('');
  const [grupo, setGrupo] = useState('');
  const [respuestas, setRespuestas] = useState({});

  const handleChangeNombre = (event) => {
    setNombre(event.target.value);
  };

  const handleChangeGrupo = (event) => {
    setGrupo(event.target.value);
  };

  const handleChangeRespuesta = (pregunta, respuesta) => {
    setRespuestas({ ...respuestas, [pregunta]: respuesta });
  };

  const handleSubmit = () => {
    // Aquí puedes procesar las respuestas como desees
    console.log('Nombre:', nombre);
    console.log('Grupo:', grupo);
    console.log('Respuestas:', respuestas);
  };

  const preguntas = [
    "Tengo fama de decir lo que pienso claramente y sin rodeos.",
    "Estoy seguro(a) de lo que es bueno y lo que es malo, lo que esta bien y lo que está mal",
    "Muchas veces actuó sin mirar las consecuencias",
    // Añadir más preguntas aquí según sea necesario
  ];

  return (
    <div>
      <Grid container spacing={2}>
        <Grid item xs={12}>
          <TextField
            label="Nombre"
            variant="outlined"
            value={nombre}
            onChange={handleChangeNombre}
            fullWidth
          />
        </Grid>
        <Grid item xs={12}>
          <FormControl variant="outlined" fullWidth>
            <InputLabel id="grupo-label">Grupo</InputLabel>
            <Select
              labelId="grupo-label"
              value={grupo}
              onChange={handleChangeGrupo}
              label="Grupo"
            >
              <MenuItem value="Grupo 1">Grupo 1</MenuItem>
              <MenuItem value="Grupo 2">Grupo 2</MenuItem>
            </Select>
          </FormControl>
        </Grid>
        <Grid item xs={12}>
          <Typography variant="h6">Por favor, responde las siguientes preguntas:</Typography>
        </Grid>
        {preguntas.map((pregunta, index) => (
          <Grid item xs={12} key={index}>
            <Typography>{pregunta}</Typography>
            <RadioGroup
              row
              aria-label={`respuesta-${index}`}
              name={`respuesta-${index}`}
              value={respuestas[pregunta] || ''}
              onChange={(event) => handleChangeRespuesta(pregunta, event.target.value)}
            >
              <FormControlLabel value="+" control={<Radio />} label="+" />
              <FormControlLabel value="-" control={<Radio />} label="-" />
            </RadioGroup>
          </Grid>
        ))}
        <Grid item xs={12}>
          <Button variant="contained" color="primary" onClick={handleSubmit}>Guardar Cuestionario</Button>
        </Grid>
      </Grid>
    </div>
  );
}

export default Cuestionario;
