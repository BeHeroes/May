#include <iostream>

using namespace std;

int main()
{
    int N, i, max=0, num;
    double avg=0;
    scanf("%d", &N);
    for(i=0;i<N;i++){ 
        scanf("%d", &num);
        if(max<num) max=num;
        avg += num;
    }
    avg = avg / N * 100 / max;
    printf("%f", avg);
}
