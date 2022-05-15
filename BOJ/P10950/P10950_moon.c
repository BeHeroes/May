#include <iostream>

using namespace std;

int main()
{
    int N, i, A, B;
    scanf("%d", &N);
    for(i=0;i<N;i++){
        scanf("%d%d", &A, &B);
        printf("%d\n", A+B);
    }
}
