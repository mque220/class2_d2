#include<stdio.h>

int main(void) {
    int a, b, c, d, e;
    scanf("%d %d %d %d %d", &a, &b, &c, &d, &e);
    a = a*a % 10;
    b = b*b % 10;
    c = c*c % 10;
    d = d*d % 10;
    e = e*e % 10;
    printf("%d\n", (a+b+c+d+e) % 10);
}