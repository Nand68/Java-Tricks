  for (int i = 0; i < m; i++) {
    vis[0][i] = 1;
    vis[n - 1][i] = 1;
  }
  for (int i = 1; i < n - 1; i++) {
    vis[i][0] = 1;
    vis[i][m - 1] = 1;
  }
