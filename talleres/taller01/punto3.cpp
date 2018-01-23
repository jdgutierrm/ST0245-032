#include <iostream>
#include <string>

using namespace std;

class Fecha{
  private:
  int dia;
  int mes;
  int year;

  public:
  void iguales(int dia, int dia2, int mes, int mes2, int year, int year2);
  void antesDe(int dia, int dia2, int mes, int mes2, int year, int year2);
  void despuesDe(int dia, int dia2, int mes, int mes2, int year, int year2);
};

void Fecha::iguales(int dia, int dia2, int mes, int mes2, int year, int year2){
  if(dia == dia2 && mes == mes2 && year == year2){
    cout << "Las Fechas son la misma" << endl;
  } 
}

void Fecha::antesDe(int dia, int dia2, int mes, int mes2, int year, int year2){
  if(year < year2){
    cout << "La fecha 1 esta antes de la fecha 2" << endl;
  } else if(year > year2){
    cout << "La fecha 2 esta antes de la fecha 1" << endl;
  } else if(year == year2 && mes < mes2){
    cout << "La fecha 1 esta antes de la fecha 2" << endl;
  } else if(year == year2 && mes > mes2){
    cout << "La fecha 2 esta antes de la fecha 1" << endl;
  } else if(year == year2 && mes == mes2 && dia < dia2){
    cout << "La fecha 1 esta antes de la fecha 2" << endl;
  } else {
    cout << "La fecha 2 esta antes de la fecha 1" << endl;
  }
}

void Fecha::despuesDe(int dia, int dia2, int mes, int mes2, int year, int year2){
   if(year < year2){
    cout << "La fecha 2 esta despues de la fecha 1" << endl;
  } else if(year > year2){
    cout << "La fecha 1 esta despues de la fecha 2" << endl;
  } else if(year == year2 && mes < mes2){
    cout << "La fecha 2 esta despues de la fecha 1" << endl;
  } else if(year == year2 && mes > mes2){
    cout << "La fecha 1 esta despues de la fecha 2" << endl;
  } else if(year == year2 && mes == mes2 && dia < dia2){
    cout << "La fecha 2 esta despues de la fecha 1" << endl;
  } else {
    cout << "La fecha 1 esta despues de la fecha 2" << endl;
  }
}

int main(){
  Fecha miFecha;
  int dia;
  int mes;
  int year;
  int dia2;
  int mes2;
  int year2;
  cout << "Ingrese el dia de la primera fecha: ";
  cin >> dia;
  cout << "Ingrese el mes de la primera fecha: ";
  cin >> mes;
  cout << "Ingrese el año de la primera fecha: ";
  cin >> year;
  cout << "Ingrese el dia de la segunda fecha: ";
  cin >> dia2;
  cout << "ingrese el mes de la segunda fecha: ";
  cin >> mes2;
  cout << "Ingrese el año de la segunda fecha: ";
  cin >> year2;
  
  cout << "La primera fecha es: " << to_string(dia) << " del mes " << to_string(mes) << " de " << to_string(year) << endl;  cout << "La segunda fecha es: " << to_string(dia2) << " del mes " << to_string(mes2) << " de " << to_string(year2) << endl;

  miFecha.iguales(dia,mes,year,dia2,mes2,year2);
  miFecha.antesDe(dia,mes,year,dia2,mes2,year2);
  miFecha.despuesDe(dia,mes,year,dia2,mes2,year2);
  return 0;
}
