# JavaEsprit
Prosit 5 :

Ce prosit poursuit le développement du logiciel de gestion de zoo en Java en introduisant deux nouvelles familles d'animaux : Aquatiques et Terrestres. Chaque famille a des attributs spécifiques : les animaux aquatiques sont caractérisés par leur habitat, tandis que les animaux terrestres sont définis par le nombre de pattes. En outre, des sous-classes sont créées pour des animaux aquatiques spécifiques : le dauphin et le pingouin, chacun ayant des attributs supplémentaires spécifiques tels que la vitesse de nage et la profondeur de nage.

**Instruction 20 :**
Cette étape consiste à déclarer les attributs spécifiques des classes Animal, Aquatic et Terrestrial ainsi que des sous-classes Dolphin et Penguin.

**Instruction 21 :**
Dans la méthode main, des instances de chaque classe sont créées en utilisant les constructeurs par défaut.

**Instruction 22 :**
Les constructeurs paramétrés doivent être créés dans les sous-classes Dolphin et Penguin tout en protégeant les attributs déclarés précédemment pour maintenir l'intégrité des données.

**Instruction 23 :**
Il est nécessaire de redéfinir la méthode `toString()` dans les sous-classes pour inclure à la fois les attributs communs et les attributs spécifiques à chaque type d'animal. Ensuite, dans la méthode main, les objets créés précédemment doivent être affichés.

**Instruction 24 :**
La création d'une méthode `swim()` est demandée dans les classes Aquatic, Dolphin et Penguin pour afficher un message spécifique décrivant l'action de nage. Il faut ensuite appeler cette méthode pour des objets de types Aquatic, Dolphin et Penguin dans la méthode main pour observer leur comportement respectif.
