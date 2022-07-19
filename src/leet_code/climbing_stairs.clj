(ns leet-code.climbing-stairs (:gen-class))

(defn climb-brute
  ([n] (climb-brute 0 n))
  ([i n]
   ;;(println i " " n)
   (if (> i n) 0 
   (if (== i n) 1
       (+ (climb-brute (+ i 1) n) (climb-brute (+ i 2) n))))))
   
