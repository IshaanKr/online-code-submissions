T = int(input())

while T:
    I = input().split()
    MOVES = int(I[0])
    PLAYER1 = int(I[1])
    PLAYER2 = int(I[2])

    print(2 * (180 + MOVES) - PLAYER1 - PLAYER2)

    T = T - 1