Prosit: 7

Ce prosit aborde la gestion des exceptions pour assurer le bon déroulement de l'application même dans des circonstances exceptionnelles.

Instruction 32 : La méthode addAnimal(Animal animal) voit son type de retour modifié de boolean à void, supprimant ainsi les tests de vérification du zoo plein. Cela implique que l'ajout d'animaux sera effectué sans vérifier la capacité du zoo.

Instruction 33 : Une classe d'exception personnalisée, ZooFullException, doit être créée pour gérer les situations où le zoo est plein. La méthode addAnimal doit utiliser cette nouvelle exception pour gérer l'ajout d'animaux dépassant la capacité du zoo. Des erreurs dans la méthode main doivent être corrigées pour afficher correctement le nombre d'animaux après chaque ajout, en tenant compte d'une réduction du nombre de cages à 3 pour les tests.

Instruction 34 : Il est nécessaire d'interdire l'ajout d'animaux ayant un âge négatif en renvoyant une exception InvalidAgeException dédiée. Les erreurs dans la méthode main doivent être corrigées pour gérer cette nouvelle exception et garantir la bonne gestion des ajouts d'animaux.

Ces instructions visent à améliorer la gestion des exceptions pour répondre aux cas exceptionnels qui pourraient compromettre le fonctionnement normal de l'application, en utilisant des exceptions personnalisées pour mieux gérer ces situations et maintenir la robustesse de l'application.