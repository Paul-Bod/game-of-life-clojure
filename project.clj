(defproject gol-clojure "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :main ^:skip-aot gol-clojure.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}}
  :resource-paths ["src/gol_clojure/resources"])
