Controladors de llista:
  @GetMapping("/todolists")
  @GetMapping("/todolists/{idLista}")
  @PostMapping("/todolists")
  @DeleteMapping("/todolists/{idLista}")
  @PutMapping("/todolists")
  @GetMapping("/todolists/{idLista}/todoitems")
 
Controladors de item:
  @GetMapping("/todoitems")
  @GetMapping("/todoitems/{id}")
  @PostMapping("/todoitems")
  @DeleteMapping("/todoitems/{id}")
  @PutMapping("/todoitems")
  
