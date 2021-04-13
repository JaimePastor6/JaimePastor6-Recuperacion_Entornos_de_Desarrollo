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
  
  



    
    
