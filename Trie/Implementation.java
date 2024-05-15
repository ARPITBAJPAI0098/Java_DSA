
class TrieNode {

	char data;
	boolean isTerminating;
	TrieNode children[];
	int childCount;

	public TrieNode(char data) {
		this.data = data;
		isTerminating = false;
		children = new TrieNode[26];
		childCount = 0;
	}
}

public class Trie {

	private TrieNode root;
	public int count;

	public Trie() {
		root = new TrieNode('\0');
	}

	public boolean search(String word) {
		return search(root, word);
	}

	private void add(TrieNode root, String word) {
		if (word.length() == 0) {
			root.isTerminating = true;
			return;
		}
		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];
		if (child == null) {
			child = new TrieNode(word.charAt(0));
			root.children[childIndex] = child;
			root.childCount++;
		}
		add(child, word.substring(1));

	}

	public void add(String word) {
		add(root, word);
	}

	private boolean search(TrieNode root, String word) {
		if (word.length() == 0) {
			// Check if the current node is terminating (end of a valid word)
			return root.isTerminating;
		}

		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];

		if (child != null) {
			// If the current character is found, continue searching with the next character
			return search(child, word.substring(1));
		} else {
			// If the current character is not found in the children, the word is not
			// present
			return false;
		}
	}

}