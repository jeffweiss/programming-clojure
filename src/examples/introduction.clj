(ns examples.introduction)

(defn blank? [str]
	(every? #(Character/isWhitespace %) str))

(defn hello-world [username]
	(println (format "Hello, %s" username)))

(def fibs (lazy-cat [0 1] (map + fibs (rest fibs))))

(def visitors (atom #{}))

(defn hello
	"Writes hello message to *out*. Calls you by username.
	Knows if you have been here before."
	[username]
	(swap! visitors conj username)
	(str "Hello, " username))
