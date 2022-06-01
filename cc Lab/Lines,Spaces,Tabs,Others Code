%{
#include<stdio.h>
int lc=0,sc=0,tc=0,ch=0;
%}

%%
\n {lc++;}
([ ])+ {sc++;}
\t {tc++;}
. {ch++;}

%%

int yywrap(void){}

int main() {
yylex();
printf("\nNo of lines = %d",lc);
printf("\nNo of spaces = %d",sc);
printf("\nNo of tabs = %d",tc);
printf("\nNo of other characters = %d",ch);

}
