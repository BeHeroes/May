#include <iostream>

using namespace std;

int main()
{
    int i, x, N=0;
    for(i=0;i<5;i++){
        scanf("%d", &x);
        N += x * x;
    }
    printf("%d", N%10);
}
