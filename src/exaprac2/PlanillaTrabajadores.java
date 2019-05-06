
package exaprac2;

import javax.swing.JOptionPane;

public class PlanillaTrabajadores {

    public static void main(String[] args) {
        int cant = 0;
        String detalle="Detalle de Planilla de Empleados \n\n";
        double total =0;
        double mayortotal=0;
        String mayornombre="";
        
        cant= Integer.parseInt(JOptionPane.showInputDialog("Cuantos empleados desea registarar"));
        String nombre[] = new String[cant];
        int horas[] = new int[cant];
        double salXhora[] = new double[cant];
        
        
        for(int i=0; i<cant; i++){
            nombre[i]= JOptionPane.showInputDialog("Nombre del Empleado " + (i+1));
            horas[i]= Integer.parseInt(JOptionPane.showInputDialog("Cantidad de horas trabajadas: "));
            salXhora[i] = Double.parseDouble(JOptionPane.showInputDialog("Salario por hora: "));
            total =horas[i]*salXhora[i];
            mayortotal = total;
            mayornombre = nombre[i];
            detalle += "Nombre del Empleado: " + nombre[i] + "\nSalario por hora: $" + salXhora[i]+ "\nHoras Trabajadas: " + horas[i]+ "\n\n";
            
            for(int j=0; j<total;j++){
            if(mayortotal>total){
                mayornombre=nombre[i];
            }
        }       
        }
        JOptionPane.showMessageDialog(null, detalle + " \n El total de planilla es: $" + total);
        JOptionPane.showMessageDialog(null, "El mayor sueldo es del empleado: " + mayornombre +" con sueldo $" + mayortotal +"\n" );
    }
    
}
