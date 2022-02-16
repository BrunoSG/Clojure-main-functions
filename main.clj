(def v [1 2 3 4 3 5 3 6])
(def w '(2 3 4 3 5 7 1 2))
(def T (zipmap v w) )

(defn Collatz
  [n]
  (if (= 0 (mod n 2))
      (/ n 2)
      (+ (* 3 n) 1)))
    
(defn quadratic-rest
  [a b]
  (mod (* a a) b))



(println (map Collatz w))
(println (map Collatz v)) ;applies a function to each item of a sequence returning a list

(println (for [b v]
     (Collatz  b)))
 ;takes each item of a sequence and applies a function



(println (map quadratic-rest v w));needs a sequence to each argument, returning a list
(println (map quadratic-rest w v))
(println (map quadratic-rest (keys T)(vals T)))

(def r [Collatz inc dec])
(defn evaluates 
  [number]
(map #(% number) r))
(println (evaluates 3)) ;applies multiple functions in a sequence to a number

