## JaimePastor6-Recuperacion_Entornos_de_Desarrollo
### Ejercicio 1 

Subir a un repositorio remoto un proyecto con código real, pasos realizados: 
 
    -git init 
  
    -git add .
  
    -git commit -m "Primer commit"
  
    -git push --set-upstream 'url' master


### Ejercicio 2

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
   
   
   ### Ejercicio 3
   
   Trabajo con conflictos:
   
    - Realizamos un cambio desde dirCasa y lo añadimos al repositorio remoto

  ![image](https://user-images.githubusercontent.com/72935966/114544568-1e586a80-9c5b-11eb-9ef1-9702515fc9bc.png)

    - Creamos un nuevo fichero e intentamos subirlo sin hacer git pull 

  ![image](https://user-images.githubusercontent.com/72935966/114545686-8b203480-9c5c-11eb-8c84-66b0edf0221e.png)
  
    - Nos esta pidiendo que antes de hacer un push recuperemos primero (fetch first)
    - Usamos git fetch para ver que cambios hay en el repositorio remoto, git rebase para recopilar los cambios, y git push para subirlo
   ![image](https://user-images.githubusercontent.com/72935966/114546034-fff36e80-9c5c-11eb-8ec5-969c7b220b34.png)

  Ahora realizamos el mismo cambio en las dos carpetas
 
    - Al realizar el mismo cambio y subirlo desde las dos carpetas nos saltara un error

![image](https://user-images.githubusercontent.com/72935966/114547058-3a114000-9c5e-11eb-8c88-d98d7a554824.png)

    - (Fetch First) Hacemos "git fetch origin master" y "git merge origin master" y ahora nos da otro error (non-fast-forward)
    - Vemos los cambios que hay en el repositorio remoto "git fetch origin master:tmp
    - Recopilamos los cambios git rebase tmp
    - Los subimos git push origin HEAD:master 
  
  ![image](https://user-images.githubusercontent.com/72935966/114548153-aa6c9100-9c5f-11eb-8931-2909972e7047.png)
  
 Ahora realizamos un cambio en la misma linea pero con distinto contenido en cada carpeta
 
    - Al intentar subirlo al repositorio nos da un error, si intentamos hacer el push directamente desde el IntelliJ, nos dice que antes debe hacerse un merge, y nos da la opcion de hacerlo desde ahi

![image](https://user-images.githubusercontent.com/72935966/114549599-7b571f00-9c61-11eb-81a7-f486fe3616d9.png)

    - Si hacemos el git push desde GitBash nos dice que el error es (fetch first).
    - Esta vez vamos a hacerlo desde el IntelliJ para ver como solucionar el error desde ahi.
    - 
 ![image](https://user-images.githubusercontent.com/72935966/114551447-b5c1bb80-9c63-11eb-9d3f-884b192e5e68.png)
 
    - El propio IntelliJ nos marca donde esta el error, elegimos cual de los dos queremos quedarnos, o ambos



## Ejercicio 4

Etiquetas, localizar versiones

    - Para crear tags usaremos el comando git tag -a y git push --tags para subirlas
   ![image](https://user-images.githubusercontent.com/72935966/114717640-85e2e880-9d35-11eb-87a5-0a9267de4bb8.png)

    -Para movernos entre versiones usaremos git checkout + nombre de la version 
    
   ![image](https://user-images.githubusercontent.com/72935966/114718074-f7bb3200-9d35-11eb-855c-cffa343b5c25.png)

    -Al intentar hacer un comit desde otra version nos da este error 
    
 ![image](https://user-images.githubusercontent.com/72935966/114718274-26390d00-9d36-11eb-896b-6cc03545c53e.png)
 
    -git pull --tags desde dirInsti para recuperar las tags creadas
    

## Ejercicio 5

Trabajo con ramas

    - Creamos una rama y nos cambiamos a ella con git branck + nombre y git checkout + nombre 

![image](https://user-images.githubusercontent.com/72935966/114719539-7d8bad00-9d37-11eb-9d8e-36aaadd6e45d.png)

    - Desde la rama creada hacemos cambios en el archivo, git add ., git commit, y para subirlo git push origin 1
   
   ![image](https://user-images.githubusercontent.com/72935966/114720094-ff7bd600-9d37-11eb-9cf0-b6265ad952af.png)

    -Al volver a la rama principal, hacer varios cambios e intentar subirlo nos da un error
    
[image](https://user-images.githubusercontent.com/72935966/114720472-55507e00-9d38-11eb-83b1-4e019744a519.png)


    -Hacemos un git pull para actualizar las ramas y git push
 
 ![image](https://user-images.githubusercontent.com/72935966/114721311-1a9b1580-9d39-11eb-83bb-5a67d93a08e8.png)

    -Desde dirInsti hacemos un git branch --list para ver las ramas que tenemos 
   
  ![image](https://user-images.githubusercontent.com/72935966/114721742-82516080-9d39-11eb-806d-ff88d94fe897.png)

    -Al cambiar de rama podemos ver los cambios realizados en esta desde dirCasa
    -Desde la rama anteriormente creada hacemos git merge master para unir las dos ramas y despues git push.
 
![image](https://user-images.githubusercontent.com/72935966/114764052-c8bbb500-9d63-11eb-98d5-6626c323be57.png)

    -Si hacemos git log pretty=oneline podemos ver los commits y todos los cambios realizados en distintas ramas o tags.
    
![image](https://user-images.githubusercontent.com/72935966/114764774-9e1e2c00-9d64-11eb-97fd-488bb5a07353.png)
