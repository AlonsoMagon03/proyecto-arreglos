/*
Leer desde teclado 20 números enteros. A continuación muestre por pantalla cada elemento
del arrelgo junto con su cuadrado y su cubo.

 */

import javax.swing.JOptionPane;


public class proyecto_arreglos{

    public static void main(String[] args) {

//Declaración de variables
        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el 1er número entero: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el 2do número entero: "));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el 3er número entero: "));
        int num4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el 4to número entero: "));
        int num5 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el 5to número entero: "));
        int num6 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el 6to número entero: "));
        int num7 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el 7mo número entero: "));
        int num8 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el 8vo número entero: "));
        int num9 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el 9do número entero: "));
        int num10 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el 10mo número entero: "));
        int num11 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el 11er número entero: "));
        int num12 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el 12do número entero: "));
        int num13 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el 13er número entero: "));
        int num14 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el 14to número entero: "));
        int num15 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el 15to número entero: "));
        int num16 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el 16to número entero: "));
        int num17 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el 17mo número entero: "));
        int num18 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el 18vo número entero: "));
        int num19 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el 19no número entero: "));
        int num20 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el 20mo número entero: "));

//Operaciones
        //Cuadrado
        int cuadrado1 = (int) Math.pow(num1, 2);
        int cuadrado2 = (int) Math.pow(num2, 2);
        int cuadrado3 = (int) Math.pow(num3, 2);
        int cuadrado4 = (int) Math.pow(num4, 2);
        int cuadrado5 = (int) Math.pow(num5, 2);
        int cuadrado6 = (int) Math.pow(num6, 2);
        int cuadrado7 = (int) Math.pow(num7, 2);
        int cuadrado8 = (int) Math.pow(num8, 2);
        int cuadrado9 = (int) Math.pow(num9, 2);
        int cuadrado10 = (int) Math.pow(num10, 2);
        int cuadrado11 = (int) Math.pow(num11, 2);
        int cuadrado12 = (int) Math.pow(num12, 2);
        int cuadrado13 = (int) Math.pow(num13, 2);
        int cuadrado14 = (int) Math.pow(num14, 2);
        int cuadrado15 = (int) Math.pow(num15, 2);
        int cuadrado16 = (int) Math.pow(num16, 2);
        int cuadrado17 = (int) Math.pow(num17, 2);
        int cuadrado18 = (int) Math.pow(num18, 2);
        int cuadrado19 = (int) Math.pow(num19, 2);
        int cuadrado20 = (int) Math.pow(num20, 2);

        //Cubo
        int cubo1= (int) Math.pow(num1,3);
        int cubo2= (int) Math.pow(num2,3);
        int cubo3= (int) Math.pow(num3,3);
        int cubo4= (int) Math.pow(num4,3);
        int cubo5= (int) Math.pow(num5,3);
        int cubo6= (int) Math.pow(num6,3);
        int cubo7= (int) Math.pow(num7,3);
        int cubo8= (int) Math.pow(num8,3);
        int cubo9= (int) Math.pow(num9,3);
        int cubo10= (int) Math.pow(num10,3);
        int cubo11= (int) Math.pow(num11,3);
        int cubo12= (int) Math.pow(num12,3);
        int cubo13= (int) Math.pow(num13,3);
        int cubo14= (int) Math.pow(num14,3);
        int cubo15= (int) Math.pow(num15,3);
        int cubo16= (int) Math.pow(num16,3);
        int cubo17= (int) Math.pow(num17,3);
        int cubo18= (int) Math.pow(num18,3);
        int cubo19= (int) Math.pow(num19,3);
        int cubo20= (int) Math.pow(num20,3);

//Impresiones
        JOptionPane.showMessageDialog(null, "1° número: " +num1+ "\n"+"El cuadrado del numero es:"+cuadrado1+" y su cubo es: "+cubo1);
        JOptionPane.showMessageDialog(null, "2° número: " +num2+ "\n"+"El cuadrado del numero es:"+cuadrado2+" y su cubo es: "+cubo2);
        JOptionPane.showMessageDialog(null, "3° número: " +num3+ "\n"+"El cuadrado del numero es:"+cuadrado3+" y su cubo es: "+cubo3);
        JOptionPane.showMessageDialog(null, "4° número: " +num4+ "\n"+"El cuadrado del numero es:"+cuadrado4+" y su cubo es: "+cubo4);
        JOptionPane.showMessageDialog(null, "5° número: " +num5+ "\n"+"El cuadrado del numero es:"+cuadrado5+" y su cubo es: "+cubo5);
        JOptionPane.showMessageDialog(null, "6° número: " +num6+ "\n"+"El cuadrado del numero es:"+cuadrado6+" y su cubo es: "+cubo6);
        JOptionPane.showMessageDialog(null, "7° número: " +num7+ "\n"+"El cuadrado del numero es:"+cuadrado7+" y su cubo es: "+cubo7);
        JOptionPane.showMessageDialog(null, "8° número: " +num8+ "\n"+"El cuadrado del numero es:"+cuadrado8+" y su cubo es: "+cubo8);
        JOptionPane.showMessageDialog(null, "9° número: " +num9+ "\n"+"El cuadrado del numero es:"+cuadrado9+" y su cubo es: "+cubo9);
        JOptionPane.showMessageDialog(null, "10° número: " +num10+ "\n"+"El cuadrado del numero es:"+cuadrado10+" y su cubo es: "+cubo10);
        JOptionPane.showMessageDialog(null, "11° número: " +num11+ "\n"+"El cuadrado del numero es:"+cuadrado11+" y su cubo es: "+cubo11);
        JOptionPane.showMessageDialog(null, "12° número: " +num12+ "\n"+"El cuadrado del numero es:"+cuadrado12+" y su cubo es: "+cubo12);
        JOptionPane.showMessageDialog(null, "13° número: " +num13+ "\n"+"El cuadrado del numero es:"+cuadrado13+" y su cubo es: "+cubo13);
        JOptionPane.showMessageDialog(null, "14° número: " +num14+ "\n"+"El cuadrado del numero es:"+cuadrado14+" y su cubo es: "+cubo14);
        JOptionPane.showMessageDialog(null, "15° número: " +num15+ "\n"+"El cuadrado del numero es:"+cuadrado15+" y su cubo es: "+cubo15);
        JOptionPane.showMessageDialog(null, "16° número: " +num16+ "\n"+"El cuadrado del numero es:"+cuadrado16+" y su cubo es: "+cubo16);
        JOptionPane.showMessageDialog(null, "17° número: " +num17+ "\n"+"El cuadrado del numero es:"+cuadrado17+" y su cubo es: "+cubo17);
        JOptionPane.showMessageDialog(null, "18° número: " +num18+ "\n"+"El cuadrado del numero es:"+cuadrado18+" y su cubo es: "+cubo18);
        JOptionPane.showMessageDialog(null, "19° número: " +num19+ "\n"+"El cuadrado del numero es:"+cuadrado19+" y su cubo es: "+cubo19);
        JOptionPane.showMessageDialog(null, "20° número: " +num20+ "\n"+"El cuadrado del numero es:"+cuadrado20+" y su cubo es: "+cubo20);
    }
}
