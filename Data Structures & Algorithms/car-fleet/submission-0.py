class Solution:
    def carFleet(self, target: int, position: List[int], speed: List[int]) -> int:
        
        fleet = []
        cars = list(zip(position, speed))
        cars.sort(reverse = True)
        for p, s in cars:
            time = (target  - p) / s
            if not fleet:
                fleet.append(time)
            elif time > fleet[-1]:
                fleet.append(time)
        return len(fleet)
                


