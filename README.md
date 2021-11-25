Controladors de llista:
  @GetMapping("/todolists") - Listar todas las listas
  @GetMapping("/todolists/{idLista}") - Listar una lista  segun su id
  @PostMapping("/todolists") - añadir una lista
  @DeleteMapping("/todolists/{idLista}") - eliminar una lista segun su id
  @PutMapping("/todolists") - editar una lista pasando nombre lista
  @GetMapping("/todolists/{idLista}/todoitems") - listar todos los items de una lista segun el id de la lista
 
Controladors de item:
  @GetMapping("/todoitems") - listar todos los items 
  @GetMapping("/todoitems/{id}") - obtener un item en concreto segun su id
  @PostMapping("/todoitems") - añadir un item
  @DeleteMapping("/todoitems/{id}") - eliminar un item segun id 
  @PutMapping("/todoitems") - editar un item
  
