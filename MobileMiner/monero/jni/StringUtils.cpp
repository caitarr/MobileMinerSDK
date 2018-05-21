//
// Created by kzw on 2018/5/21.
//

#include "StringUtils.h"

char *intToChar(int a) {
    // int 32位
    char *b = new char[32];
    int i = 0;
    int flag = 1;
    if (a < 0) {
        b[i++] = '-';
        a = 0 - a;
        flag = -1;
    }
    while (a) {
        b[i++] = a % 10 + '0';
        a /= 10;
    }
    b[i] = '\0';
    int n = strlen(b);
    char c;
    int j = 0;

    if (flag == -1) {
        j = 1;
    }
    int k = 0;
    for (; j < n / 2; j++, k++) {
        c = b[j];
        b[j] = b[n - k - 1];
        b[n - k - 1] = c;
    }
    return b;
}

std::string toString(const int a) {
    std::ostringstream oss;
    oss << a;
    return oss.str();
}
