#include <iostream>
#include <string>

using namespace std;

class Contador{
  private:
  int id;

  public:
  int incrementos(int cont);
  int incrementar(int id);
  string toString(int id);
};

int Contador::incrementos(int cont){
  cont = cont + 1;
  return cont;
}

int Contador::incrementar(int id){
  id = id + 1;
  return id;
}

string Contador::toString(int id){
  string cadena = to_string(id);
  return cadena;
}

int main(){
  Contador miContador;
  int id = 20;
  int num;
  int incrementos = 0;
  cout << "ingrese un numero: ";
  cin >> num;
  while(num > 0){
    id = miContador.incrementar(id);
    cout << "Contador = " << id << endl;
    incrementos = miContador.incrementos(incrementos);
    cout << "Incrementos = " << incrementos << endl;
    cout << miContador.toString(id) << endl;
    cout << "Ingrese otro numero: ";
    cin >> num;
  }
  return 0;
}
