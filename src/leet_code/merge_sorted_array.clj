(ns leet-code.merge-sorted-array (:gen-class))

(defn merge-sorted-arrays [nums1 m nums2 n]
  ;;(println nums1 " " m " " nums2 " " n)
  (if (== n 0)
    nums1
    (if (or (> (nth nums2 (dec n)) (nth nums1 (dec m))) (== m 0))
      (recur (assoc nums1 (dec (+ m n)) (nth nums2 (dec n))) m nums2 (dec n))
      (recur (assoc nums1 (dec (+ m n)) (nth nums1 (dec m))) (dec m) nums2 n))))
