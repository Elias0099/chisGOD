
package com.example.demo.entity;

/**
 *
 * @author elias
 */

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Personas {
    private String nombres;
    private String apellidos;
    private String dni;
    private String telefono;
    
}
