#include <iostream>

using namespace std;

class Euclides{
  private:

  public:
  int MCD(int x, int y);
};

int Euclides::MCD(int x, int y){
  int mod;
  if(x % y == 0){
    cout << "El MCM es: " << y;
    return 0;
  } else {
    mod = x % y;
    MCD(y, mod);
  }
    
}

int main(){
  Euclides miEuclides;
  int x;
  int y;
  cout << "Ingrese el primer numero: ";
  cin >> x;
  cout << "Ingrese el segundo numero: ";
  cin >> y;
  miEuclides.MCD(x,y);
  return 0;
}
