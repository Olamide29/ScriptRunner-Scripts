import com.atlassian.jira.issue.IssueManager;
import com.atlassian.jira.issue.MutableIssue;
import com.atlassian.jira.issue.link.IssueLink

import com.atlassian.jira.component.ComponentAccessor;

IssueManager im = ComponentAccessor.getIssueManager();
MutableIssue issue = im.getIssueObject("TRAN-1858");


def changeHistoryManager = ComponentAccessor.getChangeHistoryManager()

changeHistoryManager.removeAllChangeItems(issue)
