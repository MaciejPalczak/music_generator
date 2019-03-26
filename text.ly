\version "2.18.2"

\paper {
	#(set-paper-size "a4")
}

\layout {
	indent = 0\in
ragged-last = ##f
	\context {
		\Score
		\remove "Bar_number_engraver"
	}
}\relative c'' {
\time 3/4cis4 cis4 r4 r4 
\bar "||"
}