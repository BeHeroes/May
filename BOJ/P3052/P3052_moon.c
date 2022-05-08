#include <iostream>

using namespace std;

int main()
{
    int i, x, arr[10], cnt=0, j, cmp[41];
    
    for(i=0;i<41;i++) cmp[i] = 0;

    for(i=0;i<10;i++){
        scanf("%d", &x);
        arr[i] = x % 42;
    }
    
    for(i=0;i<10;i++){
        for(j=0;j<42;j++){
            if(arr[i] == j){
                cmp[j]=1;
            }
        }
    }
    
    for(j=0;j<42;j++){
        if(cmp[j] == 1) cnt++;
    }
    printf("%d", cnt);
}
