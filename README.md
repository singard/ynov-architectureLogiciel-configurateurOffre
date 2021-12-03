# ynov-architectureLogiciel-configurateurOffre


première étape :
==

création de la base de donnée

![image](https://user-images.githubusercontent.com/77006808/144563248-0c13a55d-9224-4540-95b8-3bec92976f3f.png)

une seul table produit suffit pour nos besoin pour l'instant. par la suite, up-sell et cross-sell les catégories ou des hiérarchi pourait apparaitre.

table produit
-


### |Produit|

|id                int|  
|name      varchar(50)|  
|label    varchar(200)|  
|prix            float|  
|stock             int|  

contenue de la table :
-

![image](https://user-images.githubusercontent.com/77006808/144564669-55de234d-a01a-4064-9f74-cb1d30e040da.png)



Seconde étape, création de l'API qui discutera avec ma base de donnée, 
==

j'ai fait le choix d'une api en java car simple et complet à mettre en place pour moi

chemin implémenter

| type | chemin | implémenter | description |
 :--- | :--- | :--- 
get | /test | ok | permet de tester la liaison avec la BDD
get | /Produit/{id} | ok | permet de récupéré tout les élément d'un produit

get /test qui permet de tester la liaison avec la BDD
get /Produit/{id} permet de récupéré tout les élément d'un produit
del /Produit/{id} permet de suprimer le produit portant cet id

/!\ prendre en compte les injections sql non voulu (voir poivre et sel sur les mot de passe


