# À Helicon e além - InterFatecs 2025(Problema D)

Este repositório contém a solução para o problema **"À Helicon e além"**, elaborado pelo Prof. Dr. Lucas Baggio Figueira para a Maratona de Programação InterFatecs.

## 🌌 Contexto Literário
O problema é ambientado no universo de *Fundação*, de Isaac Asimov. Acompanhamos **Arcadia Darell** nas ruínas da Biblioteca Imperial em Trantor. Sua missão é decifrar fragmentos de manuais de naves gravitacionais para traçar rotas seguras através da galáxia, separando as coordenadas reais do ruído de informação contido nos cubos de dados deteriorados.

## 🛠️ O Desafio Técnico
Dada uma sequência de $N$ números inteiros (coordenadas), devemos encontrar a **maior soma possível** de uma subsequência cujos elementos estejam separados por uma distância constante $k$.

**Restrições:**
- $1 \le N \le 10^5$ (tamanho do vetor).
- $1 \le k \le N/2$ (salto constante).
- $-10^4 \le A_i \le 10^4$ (valor de cada elemento).

O objetivo é testar todos os valores possíveis de $k$ e, para cada um, encontrar o segmento contíguo (saltando de $k$ em $k$) que resulte na maior soma.

## 💡 Lógica da Solução
A solução utiliza uma variação do **Algoritmo de Kadane**. Para cada salto $k$:
1. Dividimos o vetor em $k$ diferentes subgrupos (um para cada ponto de partida de $0$ a $k-1$).
2. Para cada subgrupo, aplicamos o Kadane para encontrar a soma máxima em tempo linear.
3. Comparamos os resultados para encontrar o máximo global.

A complexidade final é aproximadamente $O(N \log N)$, o que permite processar $10^5$ elementos dentro do limite de tempo de maratona.


## 📥 Exemplo de Entrada
```text
12
-5 2 1 7 -3 -4 -8 10 -6 1 -1 3
```

## 📤 Exemplo de Saída
```text
20
```
*(Explicação: Com salto k=4, pegamos os índices 3, 7 e 11: 7 + 10 + 3 = 20)*

---
