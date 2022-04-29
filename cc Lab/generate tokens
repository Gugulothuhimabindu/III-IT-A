%%
"if" |
"else" |
"while" |
"for" |
"do" |
"switch" |
"goto" |
"break" |
"case" |
"const" |
"float" |
"double" |
"int" |
"long" |
"short" |
"signed" |
"unsigned" |
"register" |
"typedef" |
"return" |
"enum" |
"sizeof" |
"static" |
"struct" |
"union" |
"void" |
"main" |
"continue" |
"default" |
"printf" |
"scanf" {printf("%s is a keyword\n",yytext);}
[a-zA-Z][a-zA-Z0-9_]* {printf("%s is a identifier\n",yytext);}
[0-9]+ {printf("%s is a number",yytext);}
[+/*%\-] {printf("%s is an arithmetic operator\n",yytext);}
[< >][=]? |
[!=][=] {printf("%s is a relational operator\n",yytext);}
[&][&]|[|][|]|[!] {printf("%s is a logical operator\n",yytext);}
[<][<]|[>][>]|[&] |
[| ~ ^]  {printf("%s is a bitwise operator\n",yytext);}
[,] {printf("%s is a seperator\n",yytext);}
[;] {printf("%s is a terminator\n",yytext);}
[()] {printf("%s is a braces\n",yytext);}
[{}] {printf("%s is a paranthesis\n",yytext);}
[[]] {printf("%s is a squarebrace\n",yytext);}
"%d" |
"%c" |
"%s" |
"%f" {printf("%s is a formatspecifier\n",yytext);}
[/][/][a-z0-9A-Z #()%&+-<>!~;".,]* {printf("%s is a line comment\n",yytext);}
[/][*][a-z0-9A-Z #()%&+-<>!~;".,]*[*][/] {printf("%s is a block comment\n",yytext);}
["][a-z0-9A-Z #()%&+-<>!~;".,]*["] {printf("%s is a string\n",yytext);}
[@#$] {printf("%s is a special character\n",yytext);}
"\\n" {printf("%s is a new line character\n",yytext);}
"#include<stdio.h>" |
"#include<stdbool.h>" |
"#include<string.h>" |
"#include<math.h>" {printf("%s is a header file\n",yytext);}
%%
int yywrap(void){}
int main()
{
yylex();
return 0;
}

