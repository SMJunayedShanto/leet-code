#include<iostream>
using namespace std;

int main(){
    int x = 121;
    int rev = 0;
    while(x>rev){
        rev = (rev*10) + (x%10);
        x = x/10;
    }

    std::cout<< (x == rev || x == rev/10) << std::endl;

    return 0;
}
