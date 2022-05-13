#include <iostream>

using namespace std;

int main()
{
    int N, A, i;
    scanf("%d%d", &N, &A);
    int arr[N];
    for(i=0;i<N;i++){
        scanf("%d", &arr[i]);
        if(arr[i] < A) printf("%d ", arr[i]);
    }
    
}
