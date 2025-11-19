<strong>1.Jeżeli nie podam ścieżki do JAR-a, to automatycznie go wyszuka (ale w naszym case lepiej podać, żeby uniknąć nieporozumień).

2.Potencjalnym problemem może być Arquillian Suite Extension.

3.Dziedziczenie extensionów nie jest problemem.

4.Trzeba zbudować na początku jara z profilem (tak jak w profilu bfp) i skopiować go do target, potem wskazać go w arquillian.xml.

5.Można się pozbyć custom jarow z profilu przy budowaniu jara???, wszystko ładowane z poma?.

6.Od nowszych wersji Payara Micro Managed przy odpalaniu testów prop <arquillian.launch> nie jest konieczny, sam znajduje running container (ale w naszym case może lepiej i tak wskazać).

7.Failsave >>> Surefire, nie podac zadnych envow w tych pluginach typu MICRO_JAR (payara klamie)
</strong>
