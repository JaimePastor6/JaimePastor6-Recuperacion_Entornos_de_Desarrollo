## JaimePastor6-Recuperacion_Entornos_de_Desarrollo
### Ejercicio 1 

Subir a un repositorio remoto un proyecto con código real, pasos realizados: 

  -git init 
  
  -git add .
  
  -git commit -m "Primer commit"
  
  -git push --set-upstream 'url' master


###Ejercicio 2

Trabajo sin conflictos, pasos realizados:

  -Creamos dos carpetas llamadas dirCasa y dirInsti y hacemos git clone 'url' en cada una.
  
  ![image](https://user-images.githubusercontent.com/72935966/114542604-6b870d00-9c58-11eb-8a9b-3d9b863acb37.png)

  -Dentro del proyecto de dirCasa realizamos un cambio (En mi caso un comentario indicando el cambio realizado en dirCasa)
  
  -En el git bash hacemos git add ., git commit -m "Cambio en dirCasa", git push 'url'.
  
  ![image](https://user-images.githubusercontent.com/72935966/114542758-983b2480-9c58-11eb-847a-91840ac097a2.png)
  
   -Desde la carpeta dirInsti hacemos git pull para actualizar nuestro proyecto
   
   ![image](https://user-images.githubusercontent.com/72935966/114543133-1697c680-9c59-11eb-8012-8df9a9d5f5f1.png)

   -Realizamos un cambio en el proyecto desde dirInsti.
   
   -Desde el git bash hacemos git add ., git commit -m "Cambio hecho desde dirInti", git push 'url'.
   
   ![image](https://user-images.githubusercontent.com/72935966/114543526-99b91c80-9c59-11eb-9985-8f2895c17108.png)
