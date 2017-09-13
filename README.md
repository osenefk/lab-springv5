# lab-springv5

Ce projet est géré par Spring.
Dans les projets lab-springv1 au lab-springv4, les beans spring sont configurés dans un fichier xml (ex le fichier demo-beans.xml).
Cependant, ce projet met en oeuvre la configuration des beans spring par programmation : c'est la configuration dite full-annotation.
Les annotations suivantes sont mis en oeuvre :

- @Configuration : indique que la classe peut être utilisée par le conteneur Spring IoC comme source de définitions de beans.
- @Bean : indique à Spring qu'une méthode annotée avec @Bean renverra un objet qui devrait être enregistré dans le contexte de l'application Spring
Le reste est identique au lab-springv4.
