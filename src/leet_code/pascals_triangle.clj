(ns leet-code.pascals-triangle (:gen-class))

(defn create-row [previousRow nextRow]
  (if (== 1 (count previousRow))
    (conj nextRow 1)
    (create-row (rest previousRow) (conj nextRow (+ (first previousRow) (second previousRow))))))

(defn create-rows [numRows arr]
  (if (== (count arr) numRows)
    arr
    (recur numRows (conj arr (create-row (last arr) [1])))))

(defn pascals-triangle [numRows]
  (let [init [[1] [1 1]]]
       (if (== 0 numRows) (pop (pop init))
       (if (== 1 numRows) (pop init)
       (if (== 2 numRows)
         init
         (create-rows numRows init))))))

;;https://leetcode.com/problems/pascals-triangle/

;;input: number of rows to get (numRows)
;;output: rows of pascal's triangle in an array

;;objective: add next row of pascals triangle until numRows

;;assumptions:
;; row one will be [1]
;; row two will be [1 1]
;; calculate all cells except first and last
;; all calculated cells will be sum of the values of previousRow[n - 1] + previousRow[n] 

;;approach_1:


;;fn pascalsTriangle [numRows]
  ;; init = [[1] [1  1]]
   
   ;;deal if numRow == 0 || 1 || 2
   
   ;;create next row from previous, and add to init
      ;; next row will be length n + 1 of previous row

   ;;return final array
   


;;fn pascalsTriangle [numRows, init]
   ;;if previous row length = numRows, return init
   
   ;;else recurse numRows mapcat(previousRow[i - 1] + previousRow[n])
