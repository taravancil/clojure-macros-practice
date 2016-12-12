(defn sum-down-from_
  "from the Joy of Clojure - an accumulator"
  [sum x]
  (if (pos? x)
    (recur (+ sum x) (dec x))
    sum))

(defn sum-down-from_1
  "from The Joy of Clojure - an accumulator with loop"
  [initial-x]
  (loop [sum 0 x initial-x]
    (if (pos? x)
      (recur (+ sum x) (dec x))
      sum)))

(defn argcount_
  "From http://clojure.org/about/functional_programming"
  ([] 0)
  ([x] 1)
  ([x y] 2)
  ([x y & rest] (+ (argcount x y) (count rest))))

(defn argcount_1
  "A simplified argcount"
  ([] 0)
  ([& rest] (count rest)))

(defn argcount_2
  "An even simpler yet argcount"
  [& rest] (count rest))

(defn my-and
  "My implementation of and"
  [x y]
  (cond
    (nil? x) nil
    :else y))
