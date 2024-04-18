package com.example;

public enum diasDeLaSemana{Lunes(1),Martes(2),Miercoles(3),Jueves(4),Viernes(5),Sabado(6),Domingo(7);
    private int num;
    
    diasDeLaSemana(int _num){
        num = _num;
        
    }

public void setNum(int num) {
    this.num = num;
}
public int getNum() {
    return num;
}


}

