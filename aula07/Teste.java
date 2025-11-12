package aula07;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        ArrayList<FormaBidimensional> arrayList2D = new ArrayList<>();
        ArrayList<FormaTridimensional> arrayList3D = new ArrayList<>();
        
        arrayList2D.add(new Quadrado(6));
        arrayList2D.add(new Retangulo(2, 3));
        arrayList2D.add(new Circulo(1));
        arrayList2D.add(new Quadrado(1));
        
        arrayList3D.add(new Cubo(0));
        arrayList3D.add(new Cubo(1));
        arrayList3D.add(new Cubo(2));
        
        for(FormaBidimensional g: arrayList2D) {
            System.out.println(g.getNome()+", tem perímetro: "+ g.calcularPerimetro()+" e, área: "+g.calcularArea());
        }
        
        for(FormaTridimensional g: arrayList3D) {
            System.out.println(g.getNome()+", tem área: "+ g.calcularArea()+" e, volume: "+g.calcularVolume());
          }
    }
}