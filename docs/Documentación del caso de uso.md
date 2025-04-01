# Especificación de casos de uso

<img src="/images/Diagrama Caso de uso.drawio.png">

## Especificacion del proyecto
El proyecto trata sobre un sistema de mensajería en el cuál el usuario nuevo puede resgitrarse para poder enviar mensajería y el usuario común tambien el sistema se encarga de clasficar y detectar la mensajería y el mensajero envia la mensajería ademas de recibirlas para poder enviarlo.

## Especificación de Actores y Operaciones

### Actores

1. **Usuario**: Usuario con una cuenta en la aplicacion para poder enviar y recibir mensajeria.
2. **Usuario no registrado**: Usuario que no posee cuenta y tiene el acceso limitado.
3. **Sistema**: Es un usuario encargado de clasificar y dar el visto bueno de la mensajería.
4. **Mensajero**: Usuario que recibe y envíe la mensajería.

### Casos de uso

#### Usuario

**Enviar carta**: El usuario envia una carta.
**Enviar paquete**: El usuario envia un paquete.
**Enviar postal**: El usuario envia una carta.
**Recibir mensaje**: El usuario recibe un mensaje.
**Iniciar sesion**: El usuario inicia sesion.

#### Usuario no registrado

**Enviar carta**: El usuario envia una carta.
**Enviar paquete**: El usuario envia un paquete.
**Enviar postal**: El usuario envia una carta.
**Recibir mensaje**: El usuario recibe un mensaje.
**Iniciar sesion**: El usuario inicia sesion.

#### Sistema 

**Detecta carta**: El usuario detecta la carta.
**Detecta paquete**: El usuario detecta el paquete.
**Detecta postal**: El usuario detecta la postal.

#### Mensajero

**Recibe carta**: El usuario recibe la carta.
**Recibe paquete**: El usuario recibe el paquete.
**Recibe postal**: El usuario recibe la postal.

|  Actor | Usuario |
|---|---|
| Descripción  | _Es un usuario que puede realizar algunas acciones_  |
| Características  | __ |
| Relaciones | _Enviar y recibir mensajeria_  |
| Referencias | _Enviar carta, enviar postal, enviar paquete,recibir mensaje, iniciar sesion_ |
|  Notas |  __ |
| Autor  | _Santiago Ruiz Martin_ |
|Fecha | _20/03/2025_ |

|  Atributo |||
|---|---|---|
| _Nombre_  | _Descripción_  | _Tipo_ |
| | |

---

|  Actor | Usuario no registrado |
|---|---|
| Descripción  | _Es un usuario que no esta en el sistema_  |
| Características  | __ |
| Relaciones | _Registrarse en el sistema para poder usar el sistema de mensajeria_  |
| Referencias | _Enviar carta, enviar postal, enviar paquete,recibir mensaje, iniciar sesion_ |
|  Notas |  __ |
| Autor  | _Santiago Ruiz Martin_ |
|Fecha | _20/03/2025_ |

|  Atributo |||
|---|---|---|
| _Nombre_  | _Descripción_  | _Tipo_ |
| | |

---

|  Actor | Sistema |
|---|---|
| Descripción  | _Es un usuario que detecta la mensajeria_  |
| Características  | __ |
| Relaciones | _Detecta mediante id la mensajeria del destinatario para darselo al mensajero_  |
| Referencias | _Detecta carta, detecta paquete, detecta postal_ |
|  Notas |  __ |
| Autor  | _Santiago Ruiz Martin_ |
|Fecha | _20/03/2025_ |

|  Atributo |||
|---|---|---|
| _Nombre_  | _Descripción_  | _Tipo_ |
| | |

---

|  Actor | Mensajero |
|---|---|
| Descripción  | _Es un usuario que recibe la mensajeria para distribuirla _  |
| Características  | __ |
| Relaciones | _Recibe paquetes para poder recibir y enviar paqueteria a los usuarios_  |
| Referencias | Recibe carta, recibe paquete, recibe postal_ |
|  Notas |  __ |
| Autor  | _Santiago Ruiz Martin_ |
|Fecha | _20/03/2025_ |

|  Atributo |||
|---|---|---|
| _Nombre_  | _Descripción_  | _Tipo_ |
| | |

---

|  Caso de Uso	CU | Inciar sesion  |
  |---|---|
  | Fuentes  | _[Documento]()_  |
  | Actor  |  _Usuario, usuario no registrado_ |
  | Descripción | _El actor inicia sesion en la aplicacion_  |
  | Flujo básico | __ |
  | Pre-condiciones | __  |
  | Post-condiciones  | __  |
  |  Requerimientos | __  |
  |  Notas |  __ |
  | Autor  | _Santiago Ruiz Martin_ |
  |Fecha | _20/03/2025_ |

  |  Caso de Uso	CU | Enviar carta |
  |---|---|
  | Fuentes  | _[Documento]()_  |
  | Actor  |  _Usuario_ |
  | Descripción | _El actor envia una carta_  |
  | Flujo básico | __ |
  | Pre-condiciones | __  |
  | Post-condiciones  | __  |
  |  Requerimientos | __  |
  |  Notas |  __ |
  | Autor  | _Santiago Ruiz Martin_ |
  |Fecha | _20/03/2025_ |

  ---

  |  Caso de Uso	CU | Enviar postal |
  |---|---|
  | Fuentes  | _[Documento]()_  |
  | Actor  |  _Usuario_ |
  | Descripción | _El actor envia una postal_  |
  | Flujo básico | __ |
  | Pre-condiciones | __  |
  | Post-condiciones  | __  |
  |  Requerimientos | __  |
  |  Notas |  __ |
  | Autor  | _Santiago Ruiz Martin_ |
  |Fecha | _20/03/2025_ |

  ---

  |  Caso de Uso	CU | Enviar paquete |
  |---|---|
  | Fuentes  | _[Documento]()_  |
  | Actor  |  _Usuario_ |
  | Descripción | _El actor envia un paquete_  |
  | Flujo básico | __ |
  | Pre-condiciones | __  |
  | Post-condiciones  | __  |
  |  Requerimientos | __  |
  |  Notas |  __ |
  | Autor  | _Santiago Ruiz Martin_ |
  |Fecha | _20/03/2025_ |

  ---

  |  Caso de Uso	CU | Recibir mensaje  |
  |---|---|
  | Fuentes  | _[Documento]()_  |
  | Actor  |  _Usuario_ |
  | Descripción | _El actor recibe un mensaje sobre la mensajeria enviada_  |
  | Flujo básico | __ |
  | Pre-condiciones | __  |
  | Post-condiciones  | __  |
  |  Requerimientos | __  |
  |  Notas |  __ |
  | Autor  | _Santiago Ruiz Martin_ |
  |Fecha | _20/03/2025_ |

  ---

 |  Caso de Uso	CU | Detecta carta  |
  |---|---|
  | Fuentes  | _[Documento]()_  |
  | Actor  |  _Sistema_ |
  | Descripción | _El actor recibe la carta del Usuario_  |
  | Flujo básico | __ |
  | Pre-condiciones | __  |
  | Post-condiciones  | __  |
  |  Requerimientos | __  |
  |  Notas |  __ |
  | Autor  | _Santiago Ruiz Martin_ |
  |Fecha | _20/03/2025_ |

   ---

 |  Caso de Uso	CU | Detecta postal  |
  |---|---|
  | Fuentes  | _[Documento]()_  |
  | Actor  |  _Sistema_ |
  | Descripción | _El actor recibe la postal del Usuario_  |
  | Flujo básico | __ |
  | Pre-condiciones | __  |
  | Post-condiciones  | __  |
  |  Requerimientos | __  |
  |  Notas |  __ |
  | Autor  | _Santiago Ruiz Martin_ |
  |Fecha | _20/03/2025_ |

   ---

 |  Caso de Uso	CU | Detecta paquete  |
  |---|---|
  | Fuentes  | _[Documento]()_  |
  | Actor  |  _Sistema_ |
  | Descripción | _El actor recibe el paquete del Usuario_  |
  | Flujo básico | __ |
  | Pre-condiciones | __  |
  | Post-condiciones  | __  |
  |  Requerimientos | __  |
  |  Notas |  __ |
  | Autor  | _Santiago Ruiz Martin_ |
  |Fecha | _20/03/2025_ |

  |  Caso de Uso	CU | Recibir paquete  |
  |---|---|
  | Fuentes  | _[Documento]()_  |
  | Actor  |  _Mensajero_ |
  | Descripción | _El actor recibe el paquete clasificado del Sistema que ha sido enviado del Usuario_  |
  | Flujo básico | __ |
  | Pre-condiciones | __  |
  | Post-condiciones  | __  |
  |  Requerimientos | __  |
  |  Notas |  __ |
  | Autor  | _Santiago Ruiz Martin_ |
  |Fecha | _20/03/2025_ |

    |  Caso de Uso	CU | Recibir postal  |
  |---|---|
  | Fuentes  | _[Documento]()_  |
  | Actor  |  _Mensajero_ |
  | Descripción | _El actor recibe la postal clasificado del Sistema que ha sido enviado del Usuario_  |
  | Flujo básico | __ |
  | Pre-condiciones | __  |
  | Post-condiciones  | __  |
  |  Requerimientos | __  |
  |  Notas |  __ |
  | Autor  | _Santiago Ruiz Martin_ |
  |Fecha | _20/03/2025_ |

    |  Caso de Uso	CU | Recibir carta |
  |---|---|
  | Fuentes  | _[Documento]()_  |
  | Actor  |  _Mensajero_ |
  | Descripción | _El actor recibe la carta clasificado del Sistema que ha sido enviado del Usuario_  |
  | Flujo básico | __ |
  | Pre-condiciones | __  |
  | Post-condiciones  | __  |
  |  Requerimientos | __  |
  |  Notas |  __ |
  | Autor  | _Santiago Ruiz Martin_ |
  |Fecha | _20/03/2025_ |

