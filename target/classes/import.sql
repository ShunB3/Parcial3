INSERT INTO administradores(usuario, contra) VALUES('admin', '123');

INSERT INTO coordinadores (cedula, nombre, apellido, contra, telefono) VALUES (123456789, 'Pedro', 'Perez', '123', '3172713778');
INSERT INTO coordinadores (cedula, nombre, apellido, contra, telefono) VALUES (987654321, 'Juan', 'Garcia', '123', '3172713778');

INSERT INTO directores (cedula, nombre, apellido, contra, telefono) VALUES (741852963, 'Jose', 'Hernandez', '123', '3172713778');

INSERT INTO evaluadores (cedula, nombre, apellido, contra, telefono) VALUES (963852741, 'Angel', 'Florez', '123', '3172713778');

INSERT INTO estudiantes (cedula, nombre, apellido, contra, telefono, carrera_estudiando) VALUES (558909123, 'Julian', 'Mendoza', '123', '3172713778', 'Programador');

INSERT INTO proyectos (anteproyecto, descripcion, estado_director, radicado_anteproyecto, estado_evaluador, estado_final, radicado_comite, calificacion, director_id, evaluador_id, estudiante_id) VALUES ('Anteproyecto1', 'Descripcion1', 'EstadoDirector1', 'RadicadoAnteproyecto1', 'EstadoEvaluador1', 'EstadoFinal1', 'RadicadoComite1', 'Calificacion1', null, null, null);

