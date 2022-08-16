# Programmer: Zachariah Magee
# Class: CS145
# Date: August 2nd 2022
# Project: Towers of Hanoi
# Extra Credit

# Recursive python function that solves the puzzle
def towers_of_hanoi(disks, source_rod, destination_rod, auxiliary_rod):
    if disks == 1:
        print("Move disk 1 from source", source_rod, "to destination", destination_rod)
        return
    towers_of_hanoi(disks-1, source_rod, auxiliary_rod, destination_rod)
    print("Move disk", disks, "from source", source_rod, "to destination", destination_rod)
    towers_of_hanoi(disks-1, auxiliary_rod, destination_rod, source_rod)


# function call
n = 4
towers_of_hanoi(n, 'A', 'B', 'C')