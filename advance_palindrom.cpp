#include<iostream>
using namespace std;

int main(){
    int x = 0;
    int cons = x;
    int rev = 0;
    while(cons>0){
        rev += cons % 10;
        rev = rev * 10;
        cons = cons / 10;
    }


    std::cout<< (x == (rev/10)) << std::endl;

    return 0;
}

