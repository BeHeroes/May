#include <iostream>

using namespace std;

int main()
{
    int i, x, max=0 , cnt;
    for(i=0;i<9;i++){
        scanf("%d", &x);
        if(max<x){
            max = x;
            cnt = i + 1;
        }
    }
    printf("%d\n%d", max, cnt);
}
