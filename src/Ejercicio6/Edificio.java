/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;

/**
 *
 * @author ylian
 */
public class Edificio {
    private final String nombre;
    private int[][] apartamentos = {{0, 0, 0, 0}, 
                                    {0, 0, 0, 0},
                                    {0, 0, 0, 0},
                                    {0, 0, 0, 0},
                                    {0, 0, 0, 0},
                                    {0, 0, 0, 0},
                                    {0, 0, 0, 0},
                                    {0, 0, 0, 0},
                                    {0, 0, 0, 0},
                                    {0, 0, 0, 0}};
    
    public Edificio(String unNombre) {
        this.nombre = unNombre;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public void setCosto(int piso, int apto, int costo) {
        apto--;
        this.apartamentos[piso][apto] = costo;
    }
    
    public int costoPiso(int piso) {
        int costo = 0;
        
        for (int apto = 0; apto < this.apartamentos[0].length; apto++) {
            costo += this.apartamentos[piso][apto];
        }
        
        return costo;
    }
    
    public int costoPromedioPorApartamento() {
        int sumaCostos = 0;
        
        for (int piso = 0; piso < this.apartamentos.length; piso++) {
            sumaCostos += costoPiso(piso);
        }
        
        int promedio = sumaCostos/this.apartamentos.length;
        
        return promedio;
    }
    
    public int pisoConApartamentoMasCaro() {
        int respuesta = 0;
        
        int costoMax = 0;
        
        for (int piso = 0; piso < this.apartamentos.length; piso++) {
            for (int apto = 0; apto < this.apartamentos[0].length; apto++) {
                if (this.apartamentos[piso][apto] > costoMax) {
                    costoMax = this.apartamentos[piso][apto];
                    respuesta = piso;
                }
            }
        }
        
        return respuesta;
    }
    
    public int cantAptosConPrecioMayor(int precio) {
        int cant = 0;
        
        for (int piso = 0; piso < this.apartamentos.length; piso++) {
            for (int apto = 0;  apto < this.apartamentos[0].length; apto++) {
                if (this.apartamentos[piso][apto] > precio) {
                    cant++;
                }
            }
        }
        
        return cant;
    }
    
}
