# Contributing
Do you want to contribute Your Empire? That's cool! But first, you need to use the code formatting rules. If you're
using IntelliJ IDEA you can download Code Style template. More info at bottom of this file.

## Formatting rules
If your IDE isn't IntelliJ IDEA you must use these rules:
* Use [Allman bracket style](https://en.wikipedia.org/wiki/Indent_style#Allman_style).
* Indent by 4 spaces.
* No CRLF line endings, LF only, set your Gits 'core.autocrlf' to true.
* Don't use access modifiers in interfaces. 
* Always use braces, so don't use `if (i > 5) return true;`
* Spaces:
  * Before `if`, `for`, `while`, `switch`, `try`, `catch`, `synchronized` parentheses, use `if (bool)` instead of `if(bool)`
  * Around operators, except for method reference (`::`), use `c = a + b` instead of `c=a+b`
  * Before keywords, use `} finally` instead of `}finally`
  * After comma/semicolon, use `for (int i = 1, k = 20; i < k; i++)` instead of `for (int i = 1,k = 20;i < k;i++)`
* Import one class by one, don't use `foo.*` imports.
* Don't import inner classes.
* Just see some code if you are not understanding this.

## IntelliJ IDEA style template
If you're using [IntelliJ IDEA IDE](https://www.jetbrains.com/idea/) you can download Code Style XML from this
repository. Simply download [this](./YourEmpireStyle.xml) file and follow the steps below.
1.  Click on `File` menu
2.  Click `Settings`
3.  Extend `Editor` tree item and click on `Code Style` item.
4.  Right to `Scheme: [LIST]` you can see `Manage...` button. Click it.
5.  Press `Import`, select `IntelliJ IDEA code style XML` and choose downloaded file.
6.  Press `OK` as many times, as you need.
7.  Use `CTRL + ALT + L` combination if you want to reformat your class.