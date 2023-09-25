#include <iostream>

class Complex{
  private:
    int real;
    int img;
  public:
    void print(){
      std::cout << real << "+i" << img;
    }
    //Constructor of circle
    Complex(int real , int img){
      this->real = real;
      this->img = img;
    }
};

int main(){
    Complex c1(9, 3);
    c1.print();
}