(defproject soc-pred-17 "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [proto-repl "0.3.1"]
                 [proto-repl-charts "0.3.2"]
                 [clj-http "2.3.0"]
                 [cheshire "5.7.0"]]
  :main ^:skip-aot soc-pred-17.core
  :target-path "target/%s"
  :test-paths ["test" "test/soc_pred_17"]
  :profiles {:uberjar {:aot :all}})
