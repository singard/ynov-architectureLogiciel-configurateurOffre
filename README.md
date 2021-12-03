# ynov-architectureLogiciel-configurateurOffre


première étape :

création de la base de donnée

![image](https://user-images.githubusercontent.com/77006808/144563248-0c13a55d-9224-4540-95b8-3bec92976f3f.png)

une seul table produit suffit pour nos besoin pour l'instant. par la suite, up-sell et cross-sell les catégories ou des hiérarchi pourait apparaitre.

table produit


|Produit|
____________________
|id                int|
|name      varchar(50)|
|label    varchar(200)|
|prix            float|
|stock             int|


/!\ prendre en compte les injections sql non voulu (voir poivre et sel sur les mot de passe


